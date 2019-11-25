package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.giraudos1206 on 23/11/2019.
 */
public class Oliva {

    private String codiceOliva;
    private ColoreOliva coloreOliva;
    private MaturazioneOliva maturazioneOliva;
    private Calendar dataRaccolta;

    //costruttore
    public Oliva() {
    }

    public Oliva(String codiceOliva, ColoreOliva coloreOliva, MaturazioneOliva maturazioneOliva, Calendar dataRaccolta) {
        this.codiceOliva = codiceOliva;
        this.coloreOliva = coloreOliva;
        this.maturazioneOliva = maturazioneOliva;
        this.dataRaccolta = dataRaccolta;
    }

    //getter/setter
    public String getCodiceOliva() {
        return codiceOliva;
    }

    public void setCodiceOliva(String codiceOliva) {
        this.codiceOliva = codiceOliva;
    }

    public ColoreOliva getColoreOliva() {
        return coloreOliva;
    }

    public void setColoreOliva(ColoreOliva coloreOliva) {
        this.coloreOliva = coloreOliva;
    }

    public MaturazioneOliva getMaturazioneOliva() {
        return maturazioneOliva;
    }

    public void setMaturazioneOliva(MaturazioneOliva maturazioneOliva) {
        this.maturazioneOliva = maturazioneOliva;
    }

    public Calendar getDataRaccolta() {
        return dataRaccolta;
    }

    public void setDataRaccolta(Calendar dataRaccolta) {
        this.dataRaccolta = dataRaccolta;
    }

    @Override
    public String toString() {
        return "Oliva{" +
                "codiceOliva='" + codiceOliva + '\'' +
                ", coloreOliva=" + coloreOliva +
                ", maturazioneOliva=" + maturazioneOliva +
                ", dataRaccolta=" + dataRaccolta +
                '}';
    }
}
