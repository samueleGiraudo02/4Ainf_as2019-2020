/*
 * mutex.h
 * This file is part of DelpozzoSoft
 *
 * Copyright (C) 2016 - Delpozzo - Cuneo (CN)
 *
 * DelpozzoSoft is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * DelpozzoSoft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DelpozzoSoft. If not, see <http://www.gnu.org/licenses/>.
 */

/*--------------------------------------------------------------------
  mutex.h 
	v 2.1 	(Novembre 2016)
----------------------------------------------------------------------
	Libreria di interfaccia ad oggeti per la gestione di semplici semafori
	per mutua esclusione.
	
	ITIS Delpozzo - Cuneo (CN)
	Settore Informatica 
	Author: Tosello

	Se modificate questo sorgente per favore fatene
	avere una copia agli autori originali, cosi' da 
	permettere l'allineamento ed evitare la diffusione
	di cloni o fork che non garantiscano la compatibilita'
	verso il preesistente.

	Grazie.                     			L'autore
---------------------------------------------------------------------*/
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>

#include <sys/ipc.h>
#include <sys/sem.h>

#ifndef __MUTEX_H
#define	__MUTEX_H

/* prototipi */
int mutexCreate (key_t ipc_key, int starting_value);
int mutexFind (key_t ipc_key);
int mutexRead (int sem_id);
int mutexLock(int sem_id);
int mutexUnlock(int sem_id);
int mutexRemove(int sem_id);

/* strutture per le chiamate a semop() per modificare il contenuto del mutex */
struct sembuf sem_lock = {
		0,		/* numero del mutex */
		-1,		/* togliere uno al valore nel mutex */
		SEM_UNDO };	/* non esce dal processo fino a che non e' 
				   riuscito a modificare il contenuto del mutex */
struct sembuf sem_unlock = {
		0,		/* numero del mutex */
		+1,		/* aggiungere uno al valore nel mutex */
		SEM_UNDO };	/* non esce dal processo fino a che non e' 
				   riuscito a modificare il contenuto del mutex */

/* mutexCreate()      crea un mutex
   RICEVE: l'identificativo nel sistema dell'insieme semafori e il valore al quale inizializzare
   RESTITUISCE: un intero che identifica l'insieme di semafori */
int mutexCreate (key_t ipc_key, int starting_value) {
  int ret, sem_id;

  /* semget       crea un semaforo 
     ipc_key      --> chiave univoca associata al gruppo di semafori
     1            --> numero di semafori contenuti nell'insieme
     3o parametro --> operazione da compiere messe in OR:
 		      IPC_CREAT :crea l'insieme di semafori 
		      IPC_EXCL	:restituisce un valore non valido nel caso in cui
				la struttura esista gia'	
		      0666: accesso consentito a tutti */
   sem_id = semget(ipc_key, 1, IPC_CREAT|IPC_EXCL|0666);
   if (sem_id == -1) 
     return (sem_id);  // errore 

  /* semctl       inizializzazione semaforo 
      sem_id        --> id dell'insieme di semafori 
      0             --> numero del semaforo da inizializzare
      SETVAL        --> operazione di impostazione del valore del semaforo
      starting_value--> valore di inizializzazione */
    ret = semctl(sem_id, 0, SETVAL, starting_value); 

    if (ret == -1)
		return (ret);  // errore

    return (sem_id);
 }

/* mutexFind()
   RICEVE: l'identificativo nel sistema dell'insieme di oggetti IPC 
   RESTITUISCE: un intero che identifica l'insieme di semafori */
int mutexFind (key_t ipc_key) {
     /*  semget 
     ipc_key      --> chiave univoca associata al gruppo di semafori
     il 2o parametro è ignorato; 
     il 3o parametro indica che non si compiono operazioni sul semaforo */
  return semget(ipc_key, 1, 0);
 }

/* mutexRead()
   RICEVE: l'identificativo dell' insieme di semafori
   RESTITUISCE: il valore contenuto nel semaforo (l'unico dell'insieme) */
int mutexRead (int sem_id) {
   /* semctl       lettura valore del semaforo 
      sem_id       --> id dell'insieme di semafori 
      2o parametro --> numero del semaforo dal quale leggere il valore
      GETVAL       --> operazione di lettura del valore del semaforo */
  return  semctl(sem_id, 0, GETVAL);
 }

/* mutexLock()
   RICEVE: id dell'insieme di semafori 
   RESTITUISCE: 0 in caso di successo */
int mutexLock(int sem_id) {
     /*  semop 
         sem_id     --> identificativo dell'insieme di semafori
         &sem_lock  --> operazione da effettuare
         1          --> numero di operazioni contenute nel secondo argomento */
    return semop(sem_id, &sem_lock, 1);
}

/* mutexUnlock()
   RICEVE: id dell'insieme di semafori 
   RESTITUISCE: 0 in caso di successo */
int mutexUnlock(int sem_id) {
     /*  semop 
         sem_id     --> identificativo dell'insieme di semafori
         &sem_unlock  --> operazione da effettuare
         1          --> numero di operazioni contenute nel secondo argomento */
    return semop(sem_id, &sem_unlock, 1);
 }

/* mutexRemove()
   RICEVE: id dell'insieme di semafori 
   RESTITUISCE: 0 in caso di successo */
int mutexRemove(int sem_id) {
  /* semctl       lettura valore del semaforo 
     sem_id       --> id dell'insieme di semafori 
     2o parametro --> ignorato
     IPC_RMID     --> operazione di RIMOZIONE del semaforo */
  return semctl(sem_id,	0, IPC_RMID);	
}

#endif	/* __MUTEX_H */

