package practice;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String lname;
    private String fname;
    private String patronymic;
    private String dateOfBirth;
    private String adress;
    private String telephone;
    private String phacultet;
    private int kurs;
    private String group;

    public Student(int id, String lname, String fname, String patronymic, String dateOfBirth,
                   String adress, String telephone, String phacultet, int kurs, String group){
        this.id = id;
        this.lname = lname;
        this.fname = fname;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.telephone = telephone;
        this.phacultet = phacultet;
        this.kurs = kurs;
        this.group = group;

    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", adress='" + adress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", phacultet='" + phacultet + '\'' +
                ", kurs=" + kurs +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && kurs == student.kurs && Objects.equals(lname, student.lname) && Objects.equals(fname, student.fname)
                && Objects.equals(patronymic, student.patronymic) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(adress, student.adress)
                && Objects.equals(telephone, student.telephone) && Objects.equals(phacultet, student.phacultet) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lname, fname, patronymic, dateOfBirth, adress, telephone, phacultet, kurs, group);
    }
}
