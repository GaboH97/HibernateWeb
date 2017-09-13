package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import model.City;
import model.Manager;
import model.Program;
import model.Schedule;
import model.Student;
import views.AddStudentDialog;
import views.MainWindow;

public class Controller implements ActionListener {

    private MainWindow view;
    private AddStudentDialog addStudentDl;
    private State currentState;
    private Manager manager;

    public Controller() {
        this.currentState = State.STUDENTS_TABLE;
        view = new MainWindow(this);
        addStudentDl = new AddStudentDialog(this);
        manager = new Manager();
        showStudents();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (Actions.valueOf(e.getActionCommand())) {
            case ADD:
                addAcordingCurrentState();
                break;
            case DELETE:
                delete();
                break;
            case SEARCH:
                search();
                break;
            case EDIT:
                editAcordingState();
                break;
            case SHOW_STUDENTS:
                showStudents();
                break;
            case SHOW_PROGRAMS:
                showPrograms();
                break;
            case SHOW_SCHEDULE:
                showSchedule();
                break;
            case SHOW_CITIES:
                showCities();
                break;
            case ADD_STUDENT:
                addStudent();
                break;
            case CANCEL_ADD_STUDENT:
                addStudentDl.cancelAddStudent();
                break;
            case EDIT_STUDENT:
                editStudent();
                break;
        }
    }

    private void addStudent() {
        addStudentDl.setToAddMode();
        manager.addStudent(addStudentDl.getNewStudent());
        addStudentDl.setVisible(false);
        addStudentDl.cancelAddStudent();
        view.refreshTable(manager.getStudents());
    }

    private void delete() {
        try {
            long id = view.getIdOfSelectedItem();
            switch (currentState) {
                case STUDENTS_TABLE:
                    try {
                        manager.removeStudent(manager.getStudent((int) id));
                        view.refreshTable(manager.getStudents());
                    } catch (Exception e) {
                        view.showErrorMessage("The Stundent couldn't be deleted");
                    }
                    break;
                case PROGRAM_TABLE:
                    try {
                        manager.removeProgram(manager.getProgram((int) id));
                        view.refreshTable(manager.getPrograms());
                    } catch (Exception e) {
                        view.showErrorMessage("The Program couldn't be deleted");
                    }
                    break;
                case SCHEDULE_TABLE:
                    try {
                        manager.removeSchedule(manager.getSchedule((int) id));
                        view.refreshTable(manager.getSchedules());
                    } catch (Exception e) {
                        view.showErrorMessage("The schedule couldn't be deleted");
                    }
                    break;
                case CITIES_TABLE:
                    try {
                        manager.removeCity(manager.getCity((int) id));
                        view.refreshTable(manager.getCities());
                    } catch (Exception e) {
                        view.showErrorMessage("The city couldn't be deleted");
                    }
                    break;
            }
        } catch (Exception e) {
            view.showErrorMessage("Please select an item");
        }
    }

    private void addAcordingCurrentState() {
        switch (currentState) {
            case STUDENTS_TABLE:
                addStudentDl.cancelAddStudent();
                addStudentDl.addCities(manager.getCities());
                addStudentDl.setToAddMode();
                addStudentDl.setVisible(true);
                break;
            case PROGRAM_TABLE:
                manager.addProgram(Manager.createProgram(view.createNewProgram()));
                view.refreshTable(manager.getPrograms());
                break;
            case SCHEDULE_TABLE:
                List<Program> a = manager.getPrograms();
                Program pSelected = view.getSelectedProgram(a);
                String[] dates = view.createNewSchedule();
                if (dates.length == 3) {
                    manager.addSchedule(Manager.createSchedule(Integer.parseInt(dates[0]), pSelected,
                            Integer.parseInt(dates[1]), Integer.parseInt(dates[2])));
                    view.refreshTable(manager.getSchedules());
                }
                break;
            case CITIES_TABLE:
                manager.addCity(Manager.createCity((view.createNewCity())));
                view.refreshTable(manager.getCities());
                break;
        }

    }

    private void search() {
        switch (currentState) {
            case STUDENTS_TABLE:
                view.refreshTable(manager.searchResultsForQuery(view.getSearchValue(), "Student", "name"));
                break;
            case PROGRAM_TABLE:
                view.refreshTable(manager.searchResultsForQuery(view.getSearchValue(), "Program", "name"));
                break;
            case SCHEDULE_TABLE:
                view.refreshTable(manager.searchResultsForQuery(view.getSearchValue(), "Schedule", "hourstart"));
                break;
            case CITIES_TABLE:
                view.refreshTable(manager.searchResultsForQuery(view.getSearchValue(), "City", "name"));
                break;
        }
    }

    private void showCities() {
        view.setLabelCurrent("Citie's List");
        this.currentState = State.CITIES_TABLE;
        loadTableAcordingState();
    }

    private void showSchedule() {
        view.setLabelCurrent("Schedule's List");
        this.currentState = State.SCHEDULE_TABLE;
        loadTableAcordingState();
    }

    private void showPrograms() {
        view.setLabelCurrent("Program's List");
        this.currentState = State.PROGRAM_TABLE;
        loadTableAcordingState();
    }

    public void showStudents() {
        view.setLabelCurrent("Student's List");
        this.currentState = State.STUDENTS_TABLE;
        loadTableAcordingState();
    }

    private void loadTableAcordingState() {
        switch (currentState) {
            case STUDENTS_TABLE:
                view.refreshTable(Student.getHeaderColumns(), manager.getStudents());
                break;
            case PROGRAM_TABLE:
                view.refreshTable(Program.getHeaderColumns(), manager.getPrograms());
                break;
            case SCHEDULE_TABLE:
                view.refreshTable(Schedule.getHeaderColumns(), manager.getSchedules());
                break;
            case CITIES_TABLE:
                view.refreshTable(City.getHeaderColumns(), manager.getCities());
                break;
        }
    }

    private void editAcordingState() {
        try {
            long id = view.getIdOfSelectedItem();

            switch (currentState) {
                case STUDENTS_TABLE:

                    try {
                        addStudentDl.setToEditeMode(manager.getStudent((int) id), manager.getCities());
                    } catch (Exception ex) {
                    }

                    break;
                case PROGRAM_TABLE:
                    try {
                        manager.editProgram(manager.getProgram((int) id), view.createNewProgram());
                    } catch (Exception ex) {
                    }
                    view.refreshTable(manager.getPrograms());

                    break;
                case SCHEDULE_TABLE:
                    List<Program> a = manager.getPrograms();
                    Program pSelected = view.getSelectedProgram(a);
                    String[] dates = view.createNewSchedule();
                    Schedule sc = Manager.createSchedule(Integer.parseInt(dates[0]), pSelected, Integer.parseInt(dates[1]),
                            Integer.parseInt(dates[2]));

                    try {
                        manager.editSchedule(manager.getSchedule((int) id), sc.getDayOfWeek(), sc.getHourStart(),
                                sc.getHourEnd(), sc.getProgram());
                    } catch (Exception ex) {
                    }

                    view.refreshTable(manager.getSchedules());
                    break;
                case CITIES_TABLE:
                    try {
                        manager.editCity(manager.getCity((int) id), view.createNewCity());
                    } catch (Exception ex) {
                    }
                    view.refreshTable(manager.getCities());

                    break;
            }
        } catch (Exception e) {
            view.showErrorMessage("Please select an item");
        }
    }

    private void editStudent() {
        Student student = addStudentDl.getNewStudent();
        try {
            manager.editStudent(manager.getStudent((int) view.getIdOfSelectedItem()), student.getName(),
                    student.getMail(), student.getCiudadNacimiento(), student.getPassword());
            addStudentDl.setVisible(false);
        } catch (Exception ex) {
        }
        view.refreshTable(manager.getStudents());
    }
}
