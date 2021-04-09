package com.infoberia.guiascrumesp.ui.valores;

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

public class ValoresFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_valores, container, false);
        WebView webView = root.findViewById(R.id.text_valores);

        String innerHtml = "<h2>Valores de Scrum</h2>\n" +
                "<p>El uso exitoso de Scrum depende de que las personas sean más competentes en vivir cinco valores:</p>\n" +
                "<h3>Compromiso, Enfoque, Apertura, Respeto y Coraje</h3>\n" +
                "<p>El equipo de Scrum se compromete a lograr sus objetivos y a apoyarse mutuamente. Su enfoque principal es el trabajo del Sprint para hacer el mejor progreso posible hacia estos objetivos. El equipo de Scrum y sus partes interesadas están abiertos sobre el trabajo y los desafíos. Los miembros del equipo de Scrum se respetan mutuamente para ser personas capaces e independientes, y son respetados como tales por las personas con las que trabajan. Los miembros del equipo de Scrum tienen el valor de hacer lo correcto, de trabajar en problemas difíciles.</p>\n" +
                "<p>Estos valores dan dirección al equipo de Scrum con respecto a su trabajo, acciones y comportamiento. Las decisiones que se toman, las medidas tomadas y la forma en que se utiliza Scrum deben reforzar estos valores, no disminuirlos o socavarlos. Los miembros del equipo de Scrum aprenden y exploran los valores mientras trabajan con los eventos y artefactos de Scrum. Cuando estos valores son asimilados por el equipo de Scrum y las personas con las que trabajan, los pilares empíricos de Scrum de transparencia, inspección y adaptación cobran vida construyendo confianza.</p>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}