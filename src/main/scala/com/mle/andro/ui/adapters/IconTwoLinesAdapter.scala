package com.mle.andro.ui.adapters

import android.content.Context
import android.view.View
import com.mle.andro.{TR, R}

/**
 * An adapter for items with one icon and two text views.
 *
 * @author mle
 */
abstract class IconTwoLinesAdapter[T](ctx: Context, items: Seq[T])
  extends IconOneLineAdapter[T](ctx, R.layout.icon_twolines_item, items) {

  override def decorate(view: View, item: T, position: Int) {
    super.decorate(view, item, position)
    findTypedView(view, TR.secondLine) setText secondRow(item, position)
  }

  def secondRow(item: T, pos: Int): String
}