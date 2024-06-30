package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ListActivity extends AppCompatActivity {
    ImageView imgIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<User> users = new ArrayList<User>();
        users.add(new User("String name", "descerwbriptio", 1, false));
        users.add(new User("String name", "descriptio", 12, false));
        users.add(new User("String nwefame", "descriptio", 13, false));
        users.add(new User("String n32rame", "descrwbtriptio", 14, true));
        users.add(new User("String nwqvcame", "dbtrwwrescriptio", 15, false));
        users.add(new User("String name", "descriptio", 16, false));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserAdapter(getApplicationContext(), users));

    }
//        imgIcon = findViewById(R.id.icon);
//        imgIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(ListActivity.this, "yeah", Toast.LENGTH_SHORT).show();
//                AlertDialog dialog = createDialog();
//                dialog.show();
//            }
//        });
//    }

        AlertDialog createDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("i cannot take this anymore");
        builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Random rand = new Random();
                int upperbound = 99999;
                int randInt = rand.nextInt(upperbound);
                String randNum = randInt + "";
                Intent intent = new Intent(ListActivity.this, MainActivity.class);
                intent.putExtra("Key", randNum);
                startActivity(intent);
            }

        });
        builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(ListActivity.this, "closed", Toast.LENGTH_SHORT).show();
            }
        });
        return builder.create();
        }


}