/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package dev.icerock.moko.units.basic.table

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.RecyclerView
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.units.TableUnitItem
import dev.icerock.moko.units.basic.R

actual class BasicTableUnitItem actual constructor(
    override val itemId: Long,
    private val title: StringDesc,
    private val image: ImageResource?
) : TableUnitItem {
    override val viewType: Int = R.layout.basic_table_unit

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder) {
        viewHolder as ViewHolder

        val context = viewHolder.itemView.context

        viewHolder.title.text = title.toString(context)

        viewHolder.image.visibility = if (image != null) View.VISIBLE else View.GONE
        viewHolder.image.setImageDrawable(image?.drawableResId?.let { ContextCompat.getDrawable(context, it) })
    }

    override fun createViewHolder(parent: ViewGroup, lifecycleOwner: LifecycleOwner): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.basic_table_unit, parent, false)
        return ViewHolder(view)
    }

    private class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.icon)
        val title: TextView = view.findViewById(R.id.title)
    }
}
