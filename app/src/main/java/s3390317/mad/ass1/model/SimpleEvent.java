package s3390317.mad.ass1.model;

import java.util.Calendar;

/**
 * Created by Stuart on 17/08/2016.
 */
public class SimpleEvent implements Event
{
    private String id;
    private String title;
    private Calendar start;
    private Calendar end;
    private String venue;
    private String location;
    private String note;
    // private List<People?> attendees;

    public SimpleEvent(String title, Calendar start, Calendar end, String venue,
                       String location, String note/*, List<People?> attendees*/)
    {
        // TODO Generate id
        this.title = title;
        this.start = start;
        this.end = end;
        this.venue = venue;
        this.location = location;
        this.note = note;
    }
}
