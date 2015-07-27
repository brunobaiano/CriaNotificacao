package br.com.brunobaiano.crianotificacao;

import android.app.Activity;
import android.app.NotificationManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ExecutaNotificacao extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.cancel(R.string.app_name);

        TextView textView = new TextView(this);
        textView.setText("Usuário selecionou a notificação.");
        setContentView(textView);

    }


}