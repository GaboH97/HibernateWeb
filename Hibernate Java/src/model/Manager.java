package model;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.HibernateUtil;

public class Manager {

    private List<Student> students;
    private List<City> cities;
    private List<Program> programs;
    private List<Schedule> schedules;
    private org.hibernate.Session sessionHibernate;
    private Transaction tx;

    public Manager() {
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        loadCities();
        loadStudents();
        loadPrograms();
        loadSchedules();
        sessionHibernate.close();
    }

    public Manager(List<Student> students, List<City> cities, List<Program> programs, List<Schedule> schedules,
            Session sessionHibernate, Transaction tx) {
        this.students = students;
        this.cities = cities;
        this.programs = programs;
        this.schedules = schedules;
        this.sessionHibernate = sessionHibernate;
        this.tx = tx;
    }

    public static Student createStudent(Long id, String name, String mail, String password, City cityOfBirth) {
        return new Student(id, name, mail, password, cityOfBirth);
    }

    public static Program createProgram(String name) {
        return new Program(name);
    }

    public static Schedule createSchedule(int dayOfWeek, Program program, int hourStart, int hourEnd) {
        return new Schedule(dayOfWeek, hourStart, hourEnd, program);
    }

    public static City createCity(String name) {
        return new City(name);
    }

    // -------------Cargar datos DB----//
    public void loadStudents() {
        students = sessionHibernate.createQuery("from Student").list();
    }

    public void loadCities() {
        cities = sessionHibernate.createQuery("from City").list();
    }

    public void loadPrograms() {
        programs = sessionHibernate.createQuery("from Program").list();
    }

    public void loadSchedules() {
        schedules = sessionHibernate.createQuery("from Schedule").list();
    }

    // ------------- Queries ---------------
    public List<?> searchResultsForQuery(String searchValue, String tableName, String parameter) {
        List<?> resultList = new ArrayList<Object>();
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        resultList = sessionHibernate
                .createQuery("from " + tableName + " where " + parameter + "='" + searchValue + "'").list();
        sessionHibernate.close();
        return resultList;
    }

    // --------- Operaciones CRUD ----------
    /**
     * Guarda en la base de datos un objeto
     *
     * @param object, objeto a guardar
     */
    public void saveHibernate(Object object) {
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        tx = sessionHibernate.beginTransaction();
        sessionHibernate.save(object);
        tx.commit();
        sessionHibernate.close();
    }

    /**
     * Actualiza en la base de datos un objeto
     *
     * @param object, objeto a actualizar
     */
    public void updateHibernate(Object object) {
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        tx = sessionHibernate.beginTransaction();
        sessionHibernate.update(object);
        tx.commit();
        sessionHibernate.close();
    }

    /**
     * Borra en la base de datos un objeto
     *
     * @param object, objeto a borrar
     */
    public void removeHibernate(Object object) {
        sessionHibernate = HibernateUtil.getSessionFactory().openSession();
        tx = sessionHibernate.beginTransaction();
        sessionHibernate.delete(object);
        tx.commit();
        sessionHibernate.close();
    }

    // ---Borar---//
    public void removeStudent(Student student) {
        removeHibernate(student);
        students.remove(student);
    }

    public void removeCity(City city) {
        removeHibernate(city);
        cities.remove(city);

    }

    public void removeProgram(Program program) {
        removeHibernate(program);
        programs.remove(program);
    }

    public void removeSchedule(Schedule schedule) {
        removeHibernate(schedule);
        schedules.remove(schedule);
    }

    // -----------Editar---------//
    public void editStudent(Student student, String name, String mail, City ciudadNacimiento, String password) {
        student.setCiudadNacimiento(ciudadNacimiento);
        student.setMail(mail);
        student.setName(name);
        student.setPassword(password);
        updateHibernate(student);
    }

    public void editPassworStudent(Student student, String newPass) {
        student.setPassword(newPass);
        updateHibernate(student);
    }

    public void editCity(City city, String name) {
        city.setName(name);
        updateHibernate(city);
    }

    public void editSchedule(Schedule schedule, DayOfWeek dayOfWeek, int hourStart, int hourEnd, Program program) {
        schedule.setDayOfWeek(dayOfWeek);
        schedule.setHourStart(hourStart);
        schedule.setHourEnd(hourEnd);
        schedule.setProgram(program);
        updateHibernate(schedule);
    }

    public void editProgram(Program program, String name) {
        program.setName(name);
        updateHibernate(program);
    }

    // -----------AGREGAR-----------------------//
    public void addStudent(Student student) {
        students.add(student);
        saveHibernate(student);
    }

    public void addCity(City city) {
        cities.add(city);
        saveHibernate(city);
    }

    public void addProgram(Program program) {
        programs.add(program);
        saveHibernate(program);
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
        saveHibernate(schedule);
    }

    // --gets--------//
    public List<Student> getStudents() {
        return students;
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public Student getStudent(int id) throws Exception {
        for (Student student : students) {
            if (id == student.getId()) {
                return student;
            }
        }
        throw new Exception("No encontrado");
    }

    public City getCity(int id) throws Exception {
        for (City city : cities) {
            if (id == city.getId()) {
                return city;
            }
        }
        throw new Exception("No encontrado");
    }

    public Program getProgram(int id) throws Exception {
        for (Program program : programs) {
            if (id == program.getId()) {
                return program;
            }
        }
        throw new Exception("No encontrado");
    }

    public Schedule getSchedule(int id) throws Exception {
        for (Schedule schedule : schedules) {
            if (id == schedule.getId()) {
                return schedule;
            }
        }
        throw new Exception("No encontrado");
    }
}