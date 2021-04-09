package com.infoberia.guiascrumesp.ui.equipo;

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

public class EquipoFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_equipo, container, false);
        WebView webView = root.findViewById(R.id.text_equipo);

        String innerHtml = "<h2>El equipo Scrum (Scrum Team)</h2>\n" +
                "<p>La unidad fundamental de Scrum es un pequeño equipo de personas, un equipo Scrum. El equipo Scrum consta de un Scrum Master, un propietario de producto (Product Owner) y desarrolladores. Dentro de un equipo de Scrum, no hay sub-equipos ni jerarquías. Es una unidad cohesionada de profesionales enfocada en un objetivo a la vez, el objetivo del Producto.</p>\n" +
                "<p>Los equipos de Scrum son multifuncionales, lo que significa que los miembros tienen todas las habilidades necesarias para crear valor en cada Sprint. También son autogestionados, lo que significa que internamente deciden quién hace qué, cuándo y cómo.</p>\n" +
                "<p>El equipo de Scrum es lo suficientemente pequeño como para permanecer ágil y lo suficientemente grande como para completar un trabajo significativo dentro de un Sprint, por lo general 10 o menos personas. En general, hemos descubierto que los equipos más pequeños se comunican mejor y son más productivos. Si los equipos de Scrum se vuelven demasiado grandes, se debe considerar la posibilidad de reorganizarse en varios equipos Scrum cohesionados, cada uno centrado en el mismo producto. Por lo tanto, deben compartir el mismo objetivo de producto, trabajo pendiente del producto y propietario del producto.</p>\n" +
                "<p>El equipo Scrum es responsable de todas las actividades relacionadas con los productos, desde la colaboración, verificación, mantenimiento, operación, experimentación, investigación y desarrollo, y cualquier otra cosa que pueda ser necesaria. Están estructurados y empoderados por la organización para gestionar su propio trabajo. Trabajar en Sprints a un ritmo sostenible mejora el enfoque y la consistencia del equipo de Scrum.</p>\n" +
                "<p>Todo el equipo de Scrum es responsable de crear un incremento valioso y útil en cada Sprint. Scrum define tres responsabilidades específicas dentro del equipo de Scrum: los desarrolladores, el propietario del producto (Product Owner) y el Scrum Master.</p>\n" +
                "<h3>Desarrolladores</h3>\n" +
                "<p>Los desarrolladores son las personas del equipo Scrum que se comprometen a crear cualquier aspecto de un Incremento útil (funcional) en cada Sprint.</p>\n" +
                "<p>Las habilidades específicas que necesitan los desarrolladores son a menudo amplias y variarán con el dominio del trabajo. Sin embargo, los desarrolladores siempre son responsables de:</p>\n" +
                "<ul>\n" +
                "<li>Crear un plan para el Sprint, el Sprint Backlog;</li>\n" +
                "<li>Inculcar la calidad adhiriéndose a una definición de Hecho;</li>\n" +
                "<li>Adaptar su plan cada día hacia el Objetivo Sprint;</li>\n" +
                "<li>Responsabilizarse mutuamente como profesionales.</li>\n" +
                "</ul>\n" +
                "<h3>Propietario del producto (Product Owner)</h3>\n" +
                "<p>El Propietario del Producto es responsable de maximizar el valor del producto resultante del trabajo del equipo de Scrum. La forma en que esto se hace esto puede variar ampliamente entre organizaciones, equipos Scrum e individuos.</p>\n" +
                "<p>El Propietario del Producto también es responsable de la gestión eficaz de la pila del producto (Product Backlog), que incluye:</p>\n" +
                "<ul>\n" +
                "<li>Desarrollar y comunicar explícitamente el Objetivo del Producto;</li>\n" +
                "<li>Creación y comunicación clara de elementos de trabajo pendiente del producto;</li>\n" +
                "<li>Pedido de artículos de trabajo pendiente del producto;</li>\n" +
                "<li>Asegurarse de que el trabajo pendiente del producto sea transparente, visible y comprendido.</li>\n" +
                "</ul>\n" +
                "<p>El Propietario del Producto puede hacer el trabajo anterior o puede delegar la responsabilidad a otros. En cualquier caso, el propietario del producto sigue siendo responsable.</p>\n" +
                "<p>Para que los Propietarios de Productos tengan éxito, toda la organización debe respetar sus decisiones. Estas decisiones son visibles en el contenido y el orden del trabajo pendiente del producto, y a través del Incremento inspeccionable en la revisión de Sprint.</p>\n" +
                "<p>El Propietario del Producto es una persona, no un comité. El Propietario del Producto puede representar las necesidades de muchas partes interesadas en el trabajo pendiente del producto. Aquellos que deseen cambiar el trabajo pendiente del producto pueden hacerlo tratando de negociar con criterio con el Product Owner.</p>\n" +
                "<h3>Scrum Master</h3>\n" +
                "<p>El Scrum Master es responsable de establecer Scrum tal como se define en la Guía de Scrum. Lo consigue ayudando a todos a comprender la teoría y la práctica de Scrum, tanto dentro del Equipo como en toda la organización.</p>\n" +
                "<p>El Scrum Master es responsable de la efectividad del Scrum Team. Lo logra al permitir que el equipo Scrum mejore sus prácticas, dentro del marco de Scrum.</p>\n" +
                "<p>Los Scrum Masters son verdaderos líderes que sirven al equipo Scrum y a toda la organización.</p>\n" +
                "<p>El Scrum Master sirve al equipo de Scrum de varias maneras, incluyendo:</p>\n" +
                "<ul>\n" +
                "<li>Capacitar a los miembros del equipo en autogestión y multifuncionalidad;</li>\n" +
                "<li>Ayudar al equipo de Scrum a centrarse en la creación de incrementos de alto valor que cumplan con la definición de hecho;</li>\n" +
                "<li>Promover la eliminación de los impedimentos para el progreso del equipo Scrum;</li>\n" +
                "<li>Asegurar de que todos los eventos de Scrum se lleven a cabo, sean positivos, productivos y que se respete el tiempo establecido (time-box) para cada uno de ellos.</li>\n" +
                "</ul>\n" +
                "<p>El Scrum Master sirve al Propietario del Producto (Product Owner) de varias maneras, incluyendo:</p>\n" +
                "<ul>\n" +
                "<li>Ayudar a encontrar técnicas para una definición eficaz de los objetivos del producto y la gestión de los retrasos en el producto;</li>\n" +
                "<li>Ayudar al equipo de Scrum a comprender la necesidad de elementos de trabajo pendiente de productos claros y concisos;</li>\n" +
                "<li>Ayudar a establecer la planificación empírica de productos para un entorno complejo;</li>\n" +
                "<li>Facilitar la colaboración de las partes interesadas según sea solicitado o necesario.</li>\n" +
                "</ul>\n" +
                "<p>El Scrum Master sirve a la organización de varias maneras, incluyendo:</p>\n" +
                "<ul>\n" +
                "<li>Liderar, capacitar y mentorizar a la organización en su adopción de Scrum;</li>\n" +
                "<li>Planificar y asesorar sobre la implementación de Scrum dentro de la organización;</li>\n" +
                "<li>Ayudar a las personas y a las partes interesadas a comprender y promulgar un enfoque empírico para el trabajo complejo;</li>\n" +
                "<li>Eliminar las barreras entre las partes interesadas y los equipos de Scrum.</li>\n" +
                "</ul>";

        webView.loadData( innerHtml, "text/html; charset=UTF-8", null);
        return root;
    }
}