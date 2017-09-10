package model;

import java.time.DayOfWeek;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQP")
    private Long id;
    private DayOfWeek dayOfWeek;
    private int hourStart;
    private int hourEnd;
    private String nameTrainer;

    @ManyToOne
    @JoinColumn(name = "id_program")
    private Program program;

    public Schedule(int dayOfWeek, int hourStart, int hourEnd, Program program) {
        super();
        if (dayOfWeek<1) {
            dayOfWeek = 1;
		}
        if (dayOfWeek>7) {
			dayOfWeek=7;
		}
        
        if (hourStart<1) {
			hourStart=1;
		}
        
        if (hourEnd<1) {
			hourEnd=1;
		}
        
        if (hourStart>24) {
			hourStart=24;
		}
        
        if (hourEnd>24) {
			hourEnd=24;
		}
        this.dayOfWeek = DayOfWeek.of(dayOfWeek);
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.program = program;
    }

    public Schedule() {
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getHourStart() {
        return hourStart;
    }

    public void setHourStart(int hourStart) {
        this.hourStart = hourStart;
    }

    public int getHourEnd() {
        return hourEnd;
    }

    public void setHourEnd(int hourEnd) {
        this.hourEnd = hourEnd;
    }

    public Long getId() {
        return id;
    }

    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Schedule [id=" + id + ", dayOfWeek=" + dayOfWeek + ", hourStart=" + hourStart + ", hourEnd=" + hourEnd
                + ", nameTrainer=" + nameTrainer + ", session=" + program + "]";
    }

    public static String[] getHeaderColumns() {
        return new String[]{"ID", "DOW", "START HOUR", "END HOUR", "TRAINER NAME", "PROGRAM"};
    }

    public Object[] getValuesForTable() {
        return new Object[]{id, dayOfWeek, hourStart, hourEnd, nameTrainer, program};
    }
}