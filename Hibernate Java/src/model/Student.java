package model;

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
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQP")
    private Long id;
    private String name;
    private String mail;
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    private City cityOfBirth;

    public Student(String name, String mail, String password, City ciudadNacimiento) {
        super();
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.cityOfBirth = ciudadNacimiento;
    }

    public Student(Long id, String name, String mail, String password, City ciudadNacimiento) {
        super();
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.cityOfBirth = ciudadNacimiento;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCiudadNacimiento() {
        return cityOfBirth;
    }

    public void setCiudadNacimiento(City ciudadNacimiento) {
        this.cityOfBirth = ciudadNacimiento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordValid(String password) {
        return password.equals(this.password);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", mail=" + mail + ", password=" + password
                + ", ciudadNacimiento=" + cityOfBirth + "]";
    }

    public static String[] getHeaderColumns() {
        return new String[]{"ID", "NAME", "MAIL", "PASSWORD", "CITY OF BIRTH"};
    }

    public Object[] getValuesForTable() {
        return new Object[]{id, name, mail, password, cityOfBirth.getName()};
    }

    public String getPassword() {
        return this.password;
    }
}