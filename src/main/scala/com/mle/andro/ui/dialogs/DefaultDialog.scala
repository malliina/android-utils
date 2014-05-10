package com.mle.andro.ui.dialogs

import com.mle.android.ui.dialogs.AbstractDialog
import com.mle.andro.R
import R.string.{ok, cancel}

/**
 *
 * @author mle
 */
abstract class DefaultDialog(val message: Int,
                             val title: Option[Int] = None,
                             val positiveText: Option[Int] = Some(ok),
                             val negativeText: Option[Int] = Some(cancel))
  extends AbstractDialog