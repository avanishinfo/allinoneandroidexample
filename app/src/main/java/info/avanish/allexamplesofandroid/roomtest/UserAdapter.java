package info.avanish.allexamplesofandroid.roomtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.avanish.allexamplesofandroid.R;
import info.avanish.allexamplesofandroid.roomtest.model.User;

/**
 * Created by kunwa on 05-03-2018.
 */

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {
            holder.firstNam.setText(users.get(position).getFirstName());
            holder.lastName.setText(users.get(position).getLastName());
            holder.email.setText(users.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstNam,lastName,email;

        public ViewHolder(View itemView) {
            super(itemView);
            firstNam = itemView.findViewById(R.id.first_name_adapter);
            lastName = itemView.findViewById(R.id.last_name_adapter);
            email = itemView.findViewById(R.id.email_name_adapter);
        }
    }
}
