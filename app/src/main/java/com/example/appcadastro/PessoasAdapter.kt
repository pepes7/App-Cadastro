package com.example.appcadastro

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class PessoasAdapter (context : Context) : ArrayAdapter<Pessoa>(context, 0){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view : View

        when (convertView) {
            null -> view = LayoutInflater.from(context).inflate(R.layout.list_view_item, parent, false)
            else -> view = convertView
        }

        val item = getItem(position)
        val txt_nome = view.findViewById<TextView>(R.id.txt_nome_list)
        val txt_profissao = view.findViewById<TextView>(R.id.txt_profissao_list)
        val txt_idade = view.findViewById<TextView>(R.id.txt_idade_list)

        txt_nome.text = item?.nome
        txt_profissao.text = item?.profissao
        txt_idade.text = item?.idade

        return view
    }
}