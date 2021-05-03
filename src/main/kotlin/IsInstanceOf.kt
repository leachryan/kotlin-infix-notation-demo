import kotlin.reflect.KClass

inline infix fun <reified T: Any> Any.isInstanceOf(type: KClass<T>) = this is T