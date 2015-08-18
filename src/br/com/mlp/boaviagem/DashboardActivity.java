package br.com.mlp.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
	}

	public void selecionarOpcao(View view) {
		/*
		 * com base na view que foi clicada iremos tomar a ação correta
		 */
		TextView textView = (TextView) view;
		String opcao = "Opção: " + textView.getText().toString();
		Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();

		switch (view.getId()) {
			case R.id.novo_gasto:
				startActivity(new Intent(this, GastoActivity.class));
				break;
			case R.id.nova_viagem:
				startActivity(new Intent(this, ViagemActivity.class));
				break;
		}
	}

}
