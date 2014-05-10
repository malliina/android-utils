package com.mle.andro.ui.adapters

import android.content.Context
import android.view.{LayoutInflater, ViewGroup, View}
import android.widget.ArrayAdapter
import collection.JavaConversions._
import com.mle.andro.TypedResource

/**
 *
 * @author mle
 */
abstract class BaseArrayAdapter[T](ctx: Context, layoutResourceId: Int, val items: Seq[T])
  extends ArrayAdapter[T](ctx, layoutResourceId, items) {

  /**
   * Fills the row item with information from the model item T.
   *
   * @param view the view representing one row, which may typically contain a `TextView`, icon or what-have-you
   * @param item model data to fill in row
   */
  def decorate(view: View, item: T, position: Int): Unit

  override def getView(position: Int, convertView: View, parent: ViewGroup): View = {
    val item = items(position)
    val inflater = ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE).asInstanceOf[LayoutInflater]
    // attachToRoot is false
    val rowView = inflater.inflate(layoutResourceId, parent, false)
    decorate(rowView, item, position)
    rowView
  }

  protected def findView(parent: View, childID: Int) =
    parent.findViewById(childID)

  protected def findTypedView[R](parent: View, typedResource: TypedResource[R]) =
    parent.findViewById(typedResource.id).asInstanceOf[R]
}
