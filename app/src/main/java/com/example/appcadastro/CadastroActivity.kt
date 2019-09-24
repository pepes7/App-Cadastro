package com.example.appcadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        actionBar?.hide()
        btn_cadastrar.setOnClickListener {
            val nome = txt_nome.text.toString()
            val profissao = txt_profissao.text.toString()
            val idade = txt_idade.text.toString()

            if (nome.isNotEmpty() && profissao.isNotEmpty() && idade.isNotEmpty()) {
                val pessoa = Pessoa(nome, profissao, idade)

                pessoasGlobal.add(pessoa)
                txt_nome.text.clear()
                txt_profissao.text.clear()
                txt_idade.text.clear()

                Toast.makeText(this, "Pessoa Cadastrada com sucesso!", Toast.LENGTH_SHORT).show()
            }else{
                txt_nome.error = if (txt_nome.text.isEmpty()) "Preencha o nome da pessoa"
                else null
                txt_profissao.error = if (txt_profissao.text.isEmpty()) "Preencha a profissão da pessoa" else null
                txt_idade.error = if (txt_idade.text.isEmpty()) "Preencha a idade" else null
            }
        }

        btn_cancelar.setOnClickListener {
            onBackPressed()
        }
    }
}
