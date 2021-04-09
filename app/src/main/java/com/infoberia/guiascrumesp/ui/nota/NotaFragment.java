package com.infoberia.guiascrumesp.ui.nota;

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

public class NotaFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_nota, container, false);
        WebView webView = root.findViewById(R.id.text_nota);

        String innerHtml = "<h2>Nota final</h2>\n" +
                "<p>Scrum es gratuito y se ofrece en esta guía. El marco de Scrum, como se describe en este documento, es inmutable. Aunque la implementación de sólo algunas partes de Scrum es posible, el resultado final no es Scrum. Scrum sólo existe en su totalidad y funciona bien como un contenedor para otras técnicas, metodologías y prácticas.</p>\n" +
                "<h3>Agradecimientos</h3>\n" +
                "<h4>Personas</h4>\n" +
                "<p>De las miles de personas que han contribuido a Scrum, debemos destacar a aquellos que fueron instrumentales al principio: Jeff Sutherland trabajó con Jeff McKenna y John Scumniotales,y Ken Schwaber trabajó con Mike Smith y Chris Martin, y todos ellos trabajaron juntos. Muchos otros contribuyeron en los años siguientes y sin su ayuda Scrum no sería refinado como lo es hoy en día.</p>\n" +
                "<h4>Historia de la Guía Scrum</h4>\n" +
                "<p>Ken Schwaber y Jeff Sutherland presentaron por primera vez Scrum en la Conferencia OOPSLA en 1995. Esencialmente documentó el aprendizaje que Ken y Jeff ganaron durante los años anteriores y hizo pública la primera definición formal de Scrum.</p>\n" +
                "<p>La Guía Scrum documenta Scrum como desarrollado, evolucionado y sostenido durante más de 30 años por Jeff Sutherland y Ken Schwaber. Otras fuentes proporcionan patrones, procesos e información que complementan el marco de Scrum. Estos pueden aumentar la productividad, el valor, la creatividad y la satisfacción con los resultados.</p>\n" +
                "<p>La historia completa de Scrum se describe en otro lugar. Para honrar los primeros lugares donde fue probado y comprobado, reconocemos Individual Inc., Newspage, Fidelity Investments e IDX (ahora GE Medical).</p>" +
                "<h4>Traductores</h4>\n" +
                "<p>Esta guía ha sido traducida de la versión original en inglés proporcionada por Ken Schwaber y Jeff Sutherland. El equipo de personas que han contribuido a esta traducción está formado por:</p>\n" +
                "<p>David Hernán Tardini y David Marti. Información de contacto y traductores:</p>\n" +
                "<p>David HernánTardini</p>\n" +
                "<p>Email: htardini@gmail.com</p>\n" +
                "<p>www.linkedin.com/in/davidhtardini</p>\n" +
                "<p>David Marti</p>\n" +
                "<p>Email: davidmarti@hotmail.com</p>\n" +
                "<p>https://twitter.com/xsfera</p>\n" +
                "<br>\n" +
                "<p>Versión gratuita sin afán de lucro y de apoyo para quienes se itenresan en el mundo de proyectos ágiles y requieren de esta guía de manera portable.</p>\n" +
                "<p>Se agradece a los involucrados por el material desplegado y gratuito para el aprendizaje de marcos de trabajo ágiles.</p>\n" +
                "<p>Powerder by infoberia.com</p>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}