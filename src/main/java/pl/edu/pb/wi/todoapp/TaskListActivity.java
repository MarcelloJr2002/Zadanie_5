package pl.edu.pb.wi.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class TaskListActivity extends SingleFragmentActivity {

    protected Fragment createFragment()
    {
        return new TaskListFragment();
    }

}