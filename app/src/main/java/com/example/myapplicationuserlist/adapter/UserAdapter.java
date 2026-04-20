package com.example.myapplicationuserlist.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplicationuserlist.R;
import com.example.myapplicationuserlist.model.UserModel;

import java.util.List;

public class UserAdapter extends ArrayAdapter<UserModel> {

    private final LayoutInflater inflater;
    private final int layout;
    private final List<UserModel> users;

    public UserAdapter(Context context, int resource, List<UserModel> users) {
        super(context, resource, users);
        this.users = users;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        UserModel user = users.get(position);

        viewHolder.avatar.setImageResource(user.getAvatarResource());
        viewHolder.fullName.setText(user.getFirstName() + " " + user.getLastName());
        viewHolder.location.setText(user.getCountry() + ", " + user.getCity());
        viewHolder.age.setText(user.getAge() + " років");

        return convertView;
    }

    private static class ViewHolder {
        final ImageView avatar;
        final TextView fullName;
        final TextView location;
        final TextView age;

        ViewHolder(View view) {
            avatar = view.findViewById(R.id.avatar);
            fullName = view.findViewById(R.id.fullName);
            location = view.findViewById(R.id.location);
            age = view.findViewById(R.id.age);
        }
    }
}