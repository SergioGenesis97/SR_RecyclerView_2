package mx.udg.alumnos.sr_recyclerview_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val listaDeLugares = ArrayList<Lugar>()
        listaDeLugares.add(Lugar("Guadalajara", "https://i0.wp.com/www.mimexico360.com/wp-content/uploads/2019/12/catedral-guadalajara-09-8.jpg?resize=580%2C435&ssl=1", "Descripcion"))
        listaDeLugares.add(Lugar("Zapopan", "https://guadalajara.cc/wp-content/uploads/2015/03/Zapopan_Jalisco_Mexico.jpg", "Descripcion"))
        listaDeLugares.add(Lugar("New Zeland", "https://rccl-h.assetsadobe.com/is/image/content/dam/royal/data/ports/picton-new-zealand/overview/picton-new-zealand-view-from-tirohanga-track.jpg?\$750x320\$", "Descripcion"))
        listaDeLugares.add(Lugar("Rusia", "https://static.dw.com/image/53646874_303.jpg", "Descripcion"))
        listaDeLugares.add(Lugar("Canada", "https://socialgeek.co/wp-content/uploads/2017/04/ottawa-canada.jpg", "Descripcion"))
        listaDeLugares.add(Lugar("Japon", "https://mochilerosentailandia.com/wp-content/uploads/2018/07/japon-primavera.jpg", "Descripcion"))
        listaDeLugares.add(Lugar("Holanda", "https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2018/06/amsterdam-paises-bajos-holanda.jpg", "Descripcion"))


        /*recyclerView.layoutManager = LinearLayoutManager(this,
                                        LinearLayoutManager.VERTICAL, false) */

        /*recyclerView.layoutManager = StaggeredGridLayoutManager(1,
                                     StaggeredGridLayoutManager.VERTICAL) */

        recyclerView.layoutManager = GridLayoutManager(this, 1,
                                     GridLayoutManager.VERTICAL, false)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LugarAdapter(listaDeLugares, this)
    }
}