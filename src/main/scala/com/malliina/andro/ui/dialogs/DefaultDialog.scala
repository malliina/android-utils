package com.malliina.andro.ui.dialogs

import com.malliina.android.ui.dialogs.AbstractDialog
import com.mle.andro.R.string.{cancel, ok}

abstract class DefaultDialog(val message: Int,
                             val title: Option[Int] = None,
                             val positiveText: Option[Int] = Some(ok),
                             val negativeText: Option[Int] = Some(cancel))
  extends AbstractDialog
