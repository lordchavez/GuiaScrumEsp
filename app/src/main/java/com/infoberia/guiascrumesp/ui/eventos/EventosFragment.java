package com.infoberia.guiascrumesp.ui.eventos;

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

public class EventosFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_eventos, container, false);
        WebView webView = root.findViewById(R.id.text_eventos);

        String innerHtml = "<h2>Eventos de Scrum</h2>\n" +
                "<p>El Sprint es un contenedor para todos los eventos. Cada evento en Scrum es una oportunidad formal para inspeccionar y adaptar los artefactos de Scrum. Estos eventos están diseñados específicamente para permitir la transparencia necesaria. Si no se operan los eventos según lo prescrito, se pierden oportunidades para inspeccionar y adaptarse. Los eventos se utilizan en Scrum para crear regularidad y minimizar la necesidad de reuniones no definidas en Scrum.</p>\n" +
                "<p>De manera óptima, todos los eventos se llevan a cabo al mismo tiempo y lugar para reducir la complejidad.</p>\n" +
                "<h3>El Sprint</h3>\n" +
                "<p>Los sprints son el latido del corazón de Scrum, donde las ideas se convierten en valor.</p>\n" +
                "<p>Son eventos de longitud fija de un mes o menos para crear consistencia. Un nuevo Sprint comienza inmediatamente después de la conclusión del Sprint anterior.</p>\n" +
                "<p>Todo el trabajo necesario para alcanzar el objetivo del producto, incluyendo la Planificación (Sprint Planning), Daily Scrums, Revisión del Sprint (Sprint Review ) y la Retrospectiva (Sprint Retrospective), ocurre dentro del Sprints.</p>\n" +
                "<p>Durante el Sprint:</p>\n" +
                "<ul>\n" +
                "<li>No se hacen cambios que pongan en peligro el Objetivo Sprint;</li>\n" +
                "<li>La calidad no disminuye;</li>\n" +
                "<li>El trabajo pendiente del producto se refina según sea necesario;</li>\n" +
                "<li>El alcance se puede clarificar y renegociar con el Propietario del Producto a medida que se aprende más.</li>\n" +
                "</ul>\n" +
                "<p>Los Sprints permiten la previsibilidad al garantizar la inspección y adaptación del progreso hacia un objetivo del Producto, como mínimo, una vez al mes en el calendario. Cuando el horizonte de un Sprint es demasiado largo, el Objetivo de Sprint puede volverse obsoleto, la complejidad puede aumentar y el riesgo puede aumentar. Los Sprints más cortos se pueden emplear para generar más ciclos de aprendizaje y limitar el riesgo de coste y esfuerzo a un período de tiempo más pequeño. Cada Sprint puede considerarse un proyecto corto.</p>\n" +
                "<p>Existen varias prácticas para pronosticar el progreso, como gráficos de burn-downs, burn-ups, o flujos acumulativos. Si bien han demostrado ser útiles, estos no sustituyen la importancia del empirismo. En entornos complejos, se desconoce lo que sucederá. Solo lo que ya ha sucedido se puede utilizar para la toma de decisiones con vistas a futuro.</p>\n" +
                "<p>Un Sprint podría ser cancelado si el Objetivo del Sprint se vuelve obsoleto. Solo el Propietario del Producto tiene la autoridad para cancelar el Sprint.</p>\n" +
                "<h3>Planificación de Sprint</h3>\n" +
                "<p>Sprint Planning inicia el Sprint estableciendo el trabajo que se realizará para el Sprint. Este plan resultante es creado por el trabajo colaborativo de todo el equipo de Scrum.</p>\n" +
                "<p>El propietario del producto se asegura de que los asistentes estén preparados para discutir los elementos de trabajo pendiente de producto más importantes y cómo se asignan al objetivo del producto. El equipo de Scrum también puede invitar a otras personas a asistir a la planificación del Sprint para proporcionar asesoramiento.</p>\n" +
                "<p>La planificación del Sprint aborda los siguientes temas:</p>\n" +
                "<p>Tema Uno: ¿Por qué este Sprint es valioso?</p>\n" +
                "<p>El Propietario del Producto propone cómo el producto podría aumentar su valor y utilidad en el Sprint actual. A continuación, todo el equipo de Scrum colabora para definir un objetivo de Sprint que comunique por qué el Sprint es valioso para las partes interesadas. El Objetivo Sprint debe finalizarse antes del final de la Planificación de Sprint.</p>\n" +
                "<p>Tema dos: ¿Qué se puede hacer este Sprint?</p>\n" +
                "<p>Mediante la discusión con el propietario del producto, los desarrolladores seleccionan los elementos del trabajo pendiente del producto para incluir en el Sprint actual. El equipo de Scrum puede refinar estos elementos durante este proceso, lo que aumenta la comprensión y la confianza.</p>\n" +
                "<p>Seleccionar cuánto se puede completar dentro de un Sprint puede ser un desafío. Sin embargo, cuanto más sepan los desarrolladores sobre su rendimiento pasado, su capacidad futura y su definición de hecho, más seguro estarán en sus pronósticos de Sprint.</p>\n" +
                "<p>Tema Tres: ¿Cómo se realizará el trabajo elegido?</p>\n" +
                "<p>Para cada elemento de trabajo pendiente de producto seleccionado, los desarrolladores planifican el trabajo necesario para crear un incremento que cumpla con la definición de hecho. Esto se hace a menudo mediante la descomposición de elementos de trabajo pendiente del producto en elementos de trabajo más pequeños de un día o menos. La forma de hacerlo es a la sola discreción de los Desarrolladores. Nadie más les dice cómo convertir los elementos de trabajo pendiente del producto en incrementos de valor.</p>\n" +
                "<p>El objetivo de Sprint, los elementos de trabajo pendiente de producto seleccionados para el Sprint, más el plan para entregarlos se conocen conjuntamente como el Trabajo pendiente de Sprint.</p>\n" +
                "<p>Sprint Planning tiene una duración máxima de ocho horas para un Sprint de un mes. Para sprints más cortos, el evento suele ser más corto.</p>\n" +
                "<h3>Scrum diario (Daily Scrum)</h3>\n" +
                "<p>El propósito del Daily Scrum es inspeccionar el progreso hacia el Objetivo Sprint y adaptar el Sprint Backlog según sea necesario, ajustando el próximo trabajo planeado.</p>\n" +
                "<p>El Daily Scrum es un evento de 15 minutos (máximo) para los desarrolladores del equipo de Scrum. Para reducir la complejidad, se lleva a cabo al mismo tiempo y lugar todos los días laborables del Sprint. Si el propietario del producto o el Scrum Master están trabajando activamente en los elementos del Trabajo pendiente de Sprint, participan como desarrolladores.</p>\n" +
                "<p>Los desarrolladores pueden seleccionar cualquier estructura y técnicas que deseen, siempre y cuando su Scrum diario se centre en el progreso hacia el objetivo de Sprint y produzca un plan accionable para el día siguiente de trabajo. Esto crea enfoque y mejora la autogestión.</p>\n" +
                "<p>Los Scrums diarios mejoran las comunicaciones, identifican impedimentos, promueven una rápida toma de decisiones y, en consecuencia, eliminan la necesidad de otras reuniones.</p>\n" +
                "<p>El Daily Scrum no es la única vez que los desarrolladores pueden ajustar su plan. A menudo se reúnen durante todo el día para discusiones más detalladas sobre la adaptación o replanificación del resto del trabajo del Sprint.</p>\n" +
                "<h3>Revision del Sprint (Sprint Review)</h3>\n" +
                "<p>El propósito de la revisión del Sprint es inspeccionar el resultado del Sprint y determinar futuras adaptaciones. El equipo de Scrum presenta los resultados de su trabajo a las partes interesadas clave y se discute el progreso hacia el Objetivo de Producto.</p>\n" +
                "<p>Durante el evento, el equipo de Scrum y las partes interesadas revisan lo que se logró en el Sprint y lo que ha cambiado en su entorno. En base a esta información, los asistentes colaboran en qué hacer a continuación. El trabajo pendiente del producto también se puede ajustar para satisfacer nuevas oportunidades. Sprint Review es una sesión de trabajo y el equipo de Scrum debe evitar limitarla a una presentación.</p>\n" +
                "<p>La revisión de Sprint es el penúltimo evento del Sprint y se utiliza en un plazo máximo de cuatro horas para un Sprint de un mes. Para sprints más cortos, el evento suele ser más corto.</p>\n" +
                "<h3>La retrospectiva del Sprint (Sprint Retrospective)</h3>\n" +
                "<p>El propósito de la retrospectiva Sprint es planificar formas de aumentar la calidad y la eficacia.</p>\n" +
                "<p>El equipo de Scrum inspecciona cómo fue el último Sprint con respecto a individuos, interacciones, procesos, herramientas y su definición de Hecho. Los elementos inspeccionados a menudo varían según el dominio del trabajo. Las suposiciones que los desviaron se identifican y se exploran sus orígenes. El equipo de Scrum analiza qué fue bien durante el Sprint, qué problemas encontró y cómo esos problemas fueron (o no fueron) resueltos.</p>\n" +
                "<p>El equipo de Scrum identifica los cambios más útiles para mejorar su eficacia. Las mejoras más impactantes se abordan lo antes posible. Incluso se pueden agregar al Sprint Backlog para el próximo Sprint.</p>\n" +
                "<p>La retrospectiva Sprint concluye el Sprint. Se utiliza un intervalo de tiempo de hasta un máximo de tres horas para un Sprint de un mes. Para sprints más cortos, el evento suele ser más corto. </p>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}