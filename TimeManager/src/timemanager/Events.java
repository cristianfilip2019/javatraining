/*
 * Calendar class
 */
package timemanager;


import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Calendar class
 * @author servi
 */
public class Events {
        private final Date data;        
        private final Date ora;
        private final Date duration;//if duration=0 then event is a reminder, if duration>0 then event is an activity.
        public enum NumeActivitate{ munca_platita, studiu, relatii_sociale, intretinere_corporala, hobby_pasiuni,
        somn, iesiri_calatorii_relaxare_in_aer_liber};
        private final NumeActivitate numeActivitate;
        public enum NumeSubActivitate{ job, freelancing, familie, prieteni, exercitiu_fizic, grooming};
        private final NumeSubActivitate numeSubActivitate;
        private final String descriereActivitate;
        
        public Events(String data, String ora, String duration, String numeActivitate, String numeSubActivitate,
                String descriereActivitate) throws ParseException{
                this.data = new SimpleDateFormat("dd.MM.yyyy").parse(data);
                this.ora = new SimpleDateFormat("HH:mm").parse(ora);
                this.duration = new SimpleDateFormat("HH:mm").parse(duration);
                this.numeActivitate = NumeActivitate.valueOf(numeActivitate);
                this.numeSubActivitate = NumeSubActivitate.valueOf(numeSubActivitate);
                this.descriereActivitate = descriereActivitate;       
        }
        public Date getData() {
                return data;
        }        
        public Date getOra() {
                return ora;
        }
        public Date getDuration() {
                return duration;
        }
        public NumeActivitate getNumeActivitate() {
                return numeActivitate;
        }
        public NumeSubActivitate getNumeSubActivitate() {
                return numeSubActivitate;
        }
        public String getDescriereActivitate() {
                return descriereActivitate;
        }
}
