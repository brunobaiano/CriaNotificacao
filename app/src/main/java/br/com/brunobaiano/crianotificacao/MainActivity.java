package br.com.brunobaiano.crianotificacao;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String tickerText = "mensagem";
        String titulo = "Bruno";
        String mensagem = "Exemplo de notificação";
        // desvia para uma outra activity
      //  PendingIntent p = PendingIntent.getActivity(this, 0, new Intent(this, ExecutaNotificacao.class), 0);
        //desvia para um broadcast
        PendingIntent p = PendingIntent.getBroadcast(this, 0, new Intent(this, MeuReceiver.class), 0);
        Notification n = new Notification.Builder(this)
                .setTicker(tickerText)
                .setContentTitle(titulo)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText(mensagem)
                .setContentIntent(p)
                .setWhen(System.currentTimeMillis())
                .build();
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        nm.notify(R.string.app_name, n);

        TextView textView = new TextView(this);
        textView.setText("Notificação criada...");
        setContentView(textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
