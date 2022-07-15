package com.example.visma.repository;


import com.example.visma.entity.Category;
import com.example.visma.entity.Meeting;
import com.example.visma.entity.Meetings;
import com.example.visma.entity.Type;
import org.springframework.stereotype.Repository;


@Repository
public class MeetingDao {

    private static final Meetings list = new Meetings();

    static
    {
        list.getMetingList().add(new Meeting(1, "Antanas", "Jonas", "Java meeting", Category.Hub, Type.InPerson, "2022-07-12", "2022-07-13"));
        list.getMetingList().add(new Meeting(2, "Kadagis", "Pipiras", "Visma general meeting", Category.Short, Type.Live, "2022-07-16", "2022-07-22"));
        list.getMetingList().add(new Meeting(3, "Tautvydas", "VismaGeek", "About important stuff", Category.CodeMonkey, Type.Live, "2022-07-15", "2022-07-26"));
    }


    public Meetings getAllMeetings()
    {
        return list;
    }

    public void addMeeting (Meeting meeting) {
        list.getMetingList().add(meeting);
    }


    public Meeting deleteById (int index) {
        return list.getMetingList().remove(index);
//        if (meeting.getResponsiblePerson() == ResponsiblePerson)
//        list.getMetingList().remove(meeting);

    }
}

