package s3390317.mad.ass1.model;

import java.util.Calendar;

/**
 * Created by stuart on 18/08/16.
 */
public interface SocialEvent
{
    public abstract String getId();
    public abstract String getTitle();
    public abstract void setTitle(String title);
    public abstract Calendar getStart();
    public abstract void setStart(Calendar start);
    public abstract Calendar getEnd();
    public abstract void setEnd(Calendar end);
    public abstract String getVenue();
    public abstract void setVenue(String venue);
    public abstract String getLocation();
    public abstract void setLocation(String location);
    public abstract String getNote();
    public abstract void setNote(String note);
}
