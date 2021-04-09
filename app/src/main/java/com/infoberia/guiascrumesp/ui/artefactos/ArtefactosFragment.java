package com.infoberia.guiascrumesp.ui.artefactos;

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

public class ArtefactosFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_artefactos, container, false);
        WebView webView = root.findViewById(R.id.text_artefactos);

        String innerHtml = "<h2>Artefactos de Scrum</h2>\n" +
                "<p>Los artefactos de Scrum representan trabajo o valor. Están diseñados para maximizar la transparencia de la información clave. Por lo tanto, cada uno de los que los inspecciona tienen la misma base para la adaptación.</p>\n" +
                "<p>Cada artefacto contiene un compromiso para garantizar que proporciona información que mejora la transparencia y el enfoque con el que se puede medir el progreso:</p>\n" +
                "<ul>\n" +
                "<li>Para el trabajo pendiente del producto es el objetivo del producto.</li>\n" +
                "<li>Para el Sprint Backlog es el Sprint Goal.</li>\n" +
                "<li>Para el Incremento es la Definición de Hecho.</li>\n" +
                "</ul>\n" +
                "<p>Estos compromisos existen para reforzar el empirismo y los valores de Scrum para el equipo de Scrum y sus partes interesadas.</p>\n" +
                "<h3>Pila del producto (Product Backlog)</h3>\n" +
                "<p>El trabajo pendiente del producto es una lista emergente y ordenada de lo que se necesita para mejorar el producto. Es la única fuente de trabajo emprendida por el equipo Scrum.</p>\n" +
                "<p>Los elementos de trabajo pendiente de producto que puede ser hecho por el equipo de Scrum dentro de un Sprint se consideran listos para su selección en un evento de planificación de Sprint. Por lo general adquieren este grado de transparencia después de las actividades de refinación. El refinamiento de Backlog del producto es el acto de descomponer y definir aún más los elementos de trabajo pendiente del producto en artículos más pequeños y precisos. Esta es una actividad en curso para agregar detalles, como una descripción, un pedido y un tamaño. Los atributos a menudo varían con el dominio del trabajo.</p>\n" +
                "<p>Los desarrolladores que realizarán el trabajo son responsables del tamaño. El Propietario del Producto puede influir en los Desarrolladores ayudándoles a entender y seleccionar mejores alternativas.</p>\n" +
                "<h4>Compromiso: Objetivo del producto</h4>\n" +
                "<p>El objetivo del producto describe un estado futuro del producto que puede servir como objetivo para el equipo de Scrum contra el cual planificar. El objetivo del producto se encuentra en el trabajo pendiente del producto. El resto del trabajo pendiente del producto surge para definir \"qué\" cumplirá el objetivo del producto.</p>\n" +
                "<p>Un producto es un vehículo para entregar valor. Tiene un límite claro, partes interesadas conocidas, usuarios o clientes bien definidos. Un producto podría ser un servicio, un producto físico o algo más abstracto.</p>\n" +
                "<p>El objetivo del producto es el objetivo a largo plazo para el equipo de Scrum. Deben cumplir (o abandonar) un objetivo antes de asumir el siguiente.</p>\n" +
                "<h3>La pila del Sprint (Sprint Backlog)</h3>\n" +
                "<p>El Trabajo pendiente de Sprint se compone del objetivo sprint (por qué), el conjunto de elementos de trabajo pendiente de producto seleccionados para el Sprint (qué), así como un plan accionable para entregar el incremento (cómo).</p>\n" +
                "<p>El Trabajo pendiente de Sprint es un plan por y para los desarrolladores. Es una imagen muy visible y en tiempo real del trabajo que los desarrolladores planean realizar durante el Sprint para lograr el Objetivo Sprint. Por lo tanto, el Sprint Backlog se actualiza a lo largo del Sprint a medida que se aprende más. Debe tener suficientes detalles para que puedan inspeccionar su progreso en el Scrum Diario.</p>\n" +
                "<h4>Compromiso: Sprint Goal</h4>\n" +
                "<p>El Sprint Goal es el único objetivo para el Sprint. Aunque el objetivo de Sprint es un compromiso de los desarrolladores, proporciona flexibilidad en términos del trabajo exacto necesario para lograrlo. El Objetivo Sprint también crea coherencia y enfoque, animando al equipo de Scrum a trabajar juntos en lugar de en iniciativas separadas.</p>\n" +
                "<p>El objetivo de Sprint se crea durante el evento Sprint Planning y, a continuación, se agrega al Trabajo pendiente de Sprint. A medida que los desarrolladores trabajan durante el Sprint, tienen en cuenta el objetivo de Sprint. Si el trabajo resulta ser diferente de lo que esperaban, colaboran con el propietario del producto para negociar el alcance del Trabajo pendiente de Sprint dentro del Sprint sin afectar al objetivo de Sprint.</p>\n" +
                "<h3>Incremento</h3>\n" +
                "<p>Un Incremento es un paso de hormigón hacia el Objetivo del Producto. Cada Incremento es aditivo a todos los Incrementos anteriores y verificado a fondo, asegurando que todos los Incrementos funcionen juntos. Para proporcionar el valor, el incremento debe ser utilizable.</p>\n" +
                "<p>Se pueden crear varios incrementos dentro de un Sprint. La suma de los Incrementos se presenta en la Revisión Sprint apoyando así el empirismo. Sin embargo, un Incremento puede ser entregado a las partes interesadas antes del final del Sprint. La revisión de Sprint nunca debe considerarse una puerta para liberar valor.</p>\n" +
                "<p>El trabajo no se puede considerar parte de un Incremento a menos que cumpla con la Definición de Hecho.</p>\n" +
                "<h4>Compromiso: Definición de Hecho</h4>\n" +
                "<p>La Definición de Hecho es una descripción formal del estado del Incremento cuando cumple con las medidas de calidad requeridas para el producto.</p>\n" +
                "<p>En el momento en que un elemento de trabajo pendiente de producto cumple con la definición de hecho, se crea un incremento.</p>\n" +
                "<p>La definición de Hecho crea transparencia al proporcionar a todos una comprensión compartida de qué trabajo se completó como parte del Incremento. Si un elemento de trabajo pendiente de producto no cumple con la definición de hecho, no se puede liberar, ni siquiera presentar en la revisión de Sprint. En su lugar, vuelve al Trabajo pendiente del producto para su consideración futura.</p>\n" +
                "<p>Si la definición de hecho para un incremento forma parte de los estándares de la organización, todos los equipos de Scrum deben seguirla como mínimo. Si no es un estándar organizativo, el equipo de Scrum debe crear una definición de hecho adecuada para el producto.</p>\n" +
                "<p>Los desarrolladores deben ajustarse a la definición de Hecho. Si hay varios equipos de Scrum trabajando juntos en un producto, deben definir y cumplir mutuamente con la misma definición de hecho.</p>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}