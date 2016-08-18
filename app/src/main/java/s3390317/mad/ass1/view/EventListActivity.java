package s3390317.mad.ass1.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import s3390317.mad.ass1.R;
import s3390317.mad.ass1.model.EventModel;
import s3390317.mad.ass1.model.SocialEvent;

public class EventListActivity extends Activity
{
    private EventModel eventModel;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        eventModel = EventModel.getSingletonInstance();

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<SocialEvent> arrayAdapter = new ArrayAdapter<SocialEvent>(
                this,
                android.R.layout.simple_list_item_1,
                eventModel.getEvents()
        );

        listView.setAdapter(arrayAdapter);
    }
}
