package fr.wildcodeschool.burgermenuv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.wildcodeschool.burgermenuv2.ui.burgerlist.BurgerlistFragment;

public class burgerlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burgerlist_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BurgerlistFragment.newInstance())
                    .commitNow();
        }
    }
}
