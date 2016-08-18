package s3390317.mad.ass1.model;

import java.util.Calendar;
import java.util.Collection;

/**
 * Created by Stuart on 17/08/2016.
 */
public class SimpleSocialEvent implements SocialEvent
{
    private String id;
    private String title;
    private Calendar start;
    private Calendar end;
    private String venue;
    private String location;
    private String note;
    private Collection<String> attendees;

    public SimpleSocialEvent(String title, Calendar start, Calendar end, String venue,
                             String location, String note, Collection<String> attendees)
    {
        // TODO Generate id
        this.title = title;
        this.start = start;
        this.end = end;
        this.venue = venue;
        this.location = location;
        this.note = note;
        this.attendees = attendees;
    }

    @Override
    public String getId()
    {
        return id;
    }

    @Override
    public String getTitle()
    {
        return title;
    }

    @Override
    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public Calendar getStart()
    {
        return start;
    }

    @Override
    public void setStart(Calendar start)
    {
        this.start = start;
    }

    @Override
    public Calendar getEnd()
    {
        return end;
    }

    @Override
    public void setEnd(Calendar end)
    {
        this.end = end;
    }

    @Override
    public String getVenue()
    {
        return venue;
    }

    @Override
    public void setVenue(String venue)
    {
        this.venue = venue;
    }

    @Override
    public String getLocation()
    {
        return location;
    }

    @Override
    public void setLocation(String location)
    {
        this.location = location;
    }

    @Override
    public String getNote()
    {
        return note;
    }

    @Override
    public void setNote(String note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "SimpleSocialEvent{" +
                "title='" + title + '\'' +
                ", start=" + start. +
                '}';
    }
}
