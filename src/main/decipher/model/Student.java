package main.decipher.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = 7648340269375550863L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String stud_first_name;
    private String stud_last_name;
    private String stud_address;
    private String stud_mobile_number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStud_first_name() {
        return stud_first_name;
    }

    public void setStud_first_name(String stud_first_name) {
        this.stud_first_name = stud_first_name;
    }

    public String getStud_last_name() {
        return stud_last_name;
    }

    public void setStud_last_name(String stud_last_name) {
        this.stud_last_name = stud_last_name;
    }

    public String getStud_address() {
        return stud_address;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    public String getStud_mobile_number() {
        return stud_mobile_number;
    }

    public void setStud_mobile_number(String stud_mobile_number) {
        this.stud_mobile_number = stud_mobile_number;
    }
}
