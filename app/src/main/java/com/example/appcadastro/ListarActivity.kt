package com.example.appcadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_listar.*

class ListarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listar)
        actionBar?.hide()

        val adapter = PessoasAdapter(this)
            adapter.addAll(pessoasGlobal)
            list_pessoas.adapter = adapter
    }
}
