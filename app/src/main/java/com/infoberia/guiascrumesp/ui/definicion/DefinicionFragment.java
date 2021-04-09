package com.infoberia.guiascrumesp.ui.definicion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.infoberia.guiascrumesp.R;

public class DefinicionFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_definicion, container, false);
        WebView webView = root.findViewById(R.id.text_definicion);

        String innerHtml = "<h2>Definición de Scrum</h2>\n" +
                "<p>Scrum es un marco ligero que ayuda a las personas, equipos y organizaciones a generar valor a través de soluciones adaptables para problemas complejos.</p>\n" +
                "<p>En pocas palabras, Scrum requiere un Scrum Master para fomentar un entorno donde:</p>\n" +
                "<ol>\n" +
                "<li>Un propietario del producto ordena el trabajo por un problema complejo en un trabajo pendiente del producto.</li>\n" +
                "<li>El equipo de Scrum convierte una selección del trabajo en un Incremento de valor durante un Sprint.</li>\n" +
                "<li>El equipo de Scrum y sus partes interesadas inspeccionan los resultados y se ajustan para el próximo Sprint.</li>\n" +
                "<li>Repetir</li>\n" +
                "</ol>\n" +
                "<p>Scrum es simple. Pruébalo tal cual y determine si su filosofía, teoría y estructura ayudan a alcanzar metas y crear valor. El marco de Scrum es deliberadamente incompleto, define las partes necesarias para implementar la teoría de Scrum. Scrum se basa en la inteligencia colectiva de las personas que lo utilizan. En lugar de proporcionar a las personas instrucciones detalladas, las reglas de Scrum guían sus relaciones e interacciones.</p>\n" +
                "<p>En el marco se pueden emplear diversos procesos, técnicas y métodos. Scrum envuelve las prácticas existentes o las hace innecesarias. Scrum hace visible la eficacia relativa de la gestión actual, el medio ambiente y las técnicas de trabajo, de modo que se pueden realizar mejoras.</p>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}