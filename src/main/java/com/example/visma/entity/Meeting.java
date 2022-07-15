package com.example.visma.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Getter
@Setter
public class Meeting {

    private int id;
    private String name;
    private String responsiblePerson;
    private String description;
    private Category category;
    private Type type;
    private String startDate;
    private String endDate;

    public Meeting () {

    }


    public Meeting(int id, String name, String responsiblePerson, String description, Category category, Type type, String startDate, String endDate) {
        super();
        this.id = id;
        this.name = name;
        this.responsiblePerson = responsiblePerson;
        this.description = description;
        this.category = category;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Meeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", responsiblePerson='" + responsiblePerson + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Meeting(long incrementAndGet, String format) {
    }
}
