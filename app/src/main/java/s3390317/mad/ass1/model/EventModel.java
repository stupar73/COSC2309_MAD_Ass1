package s3390317.mad.ass1.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by stuart on 18/08/16.
 */
public class EventModel
{
    private static EventModel singletonInstance = null;

    private SortedMap<Calendar, SocialEvent> sortedEvents;
    private Map<String, SocialEvent> events;

    public static EventModel getSingletonInstance()
    {
        if (singletonInstance == null)
        {
            singletonInstance = new EventModel();
        }
        return singletonInstance;
    }

    private EventModel()
    {
        sortedEvents = new TreeMap<>();
        events = new HashMap<>();

        // Add 10 sample events to the model
        for (int i = 0; i < 10; i++)
        {
            Calendar eventStart = Calendar.getInstance();
            eventStart.add(Calendar.DATE, i);
            Calendar eventEnd = eventStart;
            eventEnd.add(Calendar.HOUR, 1);

            List<String> attendees = new ArrayList<>();
            attendees.add("test attendee " + i);

            SocialEvent event = new SimpleSocialEvent("test event " + i,
                    eventStart, eventEnd, "test venue " + i, "test note " + i,
                    "test location " + i, attendees);

            addEvent(event);
        }
    }

    public void addEvent(SocialEvent event)
    {
        sortedEvents.put(event.getStart(), event);
        events.put(event.getId(), event);
    }

    public SocialEvent getEventById(String id)
    {
        return events.get(id);
    }

    public List<SocialEvent> getEvents()
    {
        return Collections.unmodifiableList(
                new ArrayList<SocialEvent>(sortedEvents.values()));
    }
}
