package planstack.structures

import scala.language.implicitConversions

object Converters {

  implicit def Pair2Tuple[T,V](v : Pair[T,V]) = Tuple2[T,V](v.value1, v.value2)
  implicit def Tuple2Pair[T,V](v : Tuple2[T,V]) = new Pair[T,V](v._1, v._2)

  implicit def Iterable2IList[T](iter:Iterable[T]) : IList[T] = new IList[T](iter.toList)
  implicit def IList2List[T](iList: IList[T]) : List[T] = iList.l
}
