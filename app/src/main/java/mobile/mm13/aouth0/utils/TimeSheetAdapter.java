package mobile.mm13.aouth0.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import mobile.mm13.aouth0.R;
import mobile.mm13.aouth0.models.TimeSheet;

public class TimeSheetAdapter extends ArrayAdapter<TimeSheet> {

    public TimeSheetAdapter(Context context, ArrayList<TimeSheet> timesheets) {
        super(context, 0, timesheets);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TimeSheet timesheet = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_entry, parent, false);
        }

        TextView tvUserID = (TextView) convertView.findViewById(R.id.tvUserID);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tvDate);
        TextView tvProjectName = (TextView) convertView.findViewById(R.id.tvProjectName);
        TextView tvHours = (TextView) convertView.findViewById(R.id.tvHours);

        tvUserID.setText(timesheet.getUserID());
        tvDate.setText(timesheet.getDateString());
        tvProjectName.setText(timesheet.getProjectName());
        tvHours.setText(Double.toString(timesheet.getHours()));

        return convertView;
    }
}