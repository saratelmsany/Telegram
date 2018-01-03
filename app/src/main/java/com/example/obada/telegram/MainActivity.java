package com.example.obada.telegram;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView mRecyclerview;

    private RecyclerView.LayoutManager mLayoutManager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mRecyclerview = (RecyclerView) findViewById(R.id.users_list);
        mRecyclerview.setHasFixedSize(true);
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Model> dataSet = new ArrayList<>();
        dataSet.add(new Model("Sara Seif", "hi", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F7jk5On8ZhZaS8M7ssOwweDOuVTo1.jpg?alt=media&token=a26eb433-e07d-4a24-b2aa-1667b8802831", "3:35 AM"));
        dataSet.add(new Model("Abdelrahman Mohamed", "hello", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F0vepTcJrpGezo8pu2Vjq8vluNaC3.jpg?alt=media&token=a3a6877f-6ea1-4919-a013-3239a134fcdb", "1:55 PM"));
        dataSet.add(new Model("Alaa Emad", "yes", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2FfcfDLIx7q1TNLQc3GmKLAC9luQn2.jpg?alt=media&token=dec4f361-b5d1-4c96-bdf2-078e541be206", "11:37 PM"));
        dataSet.add(new Model("Khaled Seif", "fine", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F0vepTcJrpGezo8pu2Vjq8vluNaC3.jpg?alt=media&token=a3a6877f-6ea1-4919-a013-3239a134fcdb", "Mon"));
        dataSet.add(new Model("Tasnim Seif", "of course :)", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F0vepTcJrpGezo8pu2Vjq8vluNaC3.jpg?alt=media&token=a3a6877f-6ea1-4919-a013-3239a134fcdb", "Nov 27"));
        dataSet.add(new Model("Omar Seif", "i will get it", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F0vepTcJrpGezo8pu2Vjq8vluNaC3.jpg?alt=media&token=a3a6877f-6ea1-4919-a013-3239a134fcdb", "Nov 07"));
        dataSet.add(new Model("Ahmed Fahmy", "how are you", "https://firebasestorage.googleapis.com/v0/b/chatoo2-6e373.appspot.com/o/images%2F0vepTcJrpGezo8pu2Vjq8vluNaC3.jpg?alt=media&token=a3a6877f-6ea1-4919-a013-3239a134fcdb", "Oct 20"));
        MAdapter adapter = new MAdapter(this.getLayoutInflater(), dataSet, getApplicationContext());
        mRecyclerview.setAdapter(adapter);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      /*  if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

      //  } else if (id == R.id.nav_share) {

       // } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
