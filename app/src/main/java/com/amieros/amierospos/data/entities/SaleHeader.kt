package com.amieros.amierospos.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.Date


@Entity()
data class SaleHeader(

    @PrimaryKey()
    @ColumnInfo(name = "SaleHeader_Id")
    val id : Int,
    val saleDate : Date,
    val InvoiceNumber : String,
    val UserId : Int,


    val DepartmentId : Int,
    val Amount : Double,
    val Vat  : Double,
    val AmountDue : Double,
    val AmountPaid : Double,
    val AmountChange : Double,
    val PaymentType : String,

    )
