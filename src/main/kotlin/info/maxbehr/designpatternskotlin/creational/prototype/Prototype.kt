package info.maxbehr.designpatternskotlin.creational.prototype

abstract class Shape: Cloneable {
    var id: String? = null
    var type: String? = null

    abstract fun draw()

    public override fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace()
        }
        return clone!!
    }
}

class Rectangle: Shape() {
    override fun draw() {
        println("Inside Rectangle::draw() method.")
    }

    init {
        type = "Rectangle"
    }
}

class Square: Shape() {
    override fun draw() {
        println("Inside Square::draw() method.")
    }

    init {
        type = "Square"
    }
}

class Circle: Shape() {
    override fun draw() {
        println("Inside Circle::draw() method.")
    }

    init {
        type = "Circle"
    }
}

object ShapeCache {
    private val shapeMap = HashMap<String?, Shape>()

    fun loadCache() {
        val circle = Circle()
        val square = Square()
        val rectangle = Rectangle()

        shapeMap.put("1", circle)
        shapeMap.put("2", square)
        shapeMap.put("3", rectangle)
    }

    fun getShape(shapeId: String): Shape {
        val cachedShape = shapeMap.get(shapeId)
        return cachedShape?.clone() as Shape
    }
}