package com.example.hak_bt1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter{
    private List<com.example.hak_bt1.ContactModel> listContact;
    private Activity activity;

    public ContactAdapter(List<com.example.hak_bt1.ContactModel> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contact, parent, false);
            ViewHolder holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tvPhone = (TextView) convertView.findViewById(R.id.tv_phone);
            holder.ivAvatar = (ImageView) convertView.findViewById(R.id.iv_avatar);
            convertView.setTag(holder);
        }
        ViewHolder holder = (ViewHolder) convertView.getTag();
        com.example.hak_bt1.ContactModel model = listContact.get(position);
        holder.tvName.setText(model.getName());
        holder.tvPhone.setText(model.getPhone());
        holder.ivAvatar.setImageResource(model.getImage());

        return convertView;
    }

    //Tạo một lần duy nhất để tránh việc tạo nhiều lần làm chậm ứng dụng
    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        ImageView ivAvatar;
    }
}
