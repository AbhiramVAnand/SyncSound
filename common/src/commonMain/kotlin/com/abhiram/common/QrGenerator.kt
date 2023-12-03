package com.abhiram.common


import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
class QrGenerator{
//    fun create() : File{
//        val folder = File(System.getProperty("user.home"),".SyncSound")
//        folder.mkdir()
//        val qr = QRCode.ofCircles()
//            .withColor(Colors.GREY)
//            .build("qwqwq.qw")
//        val pngbytes = qr.renderToBytes()
//        val file = File(folder, "qr.png")
//        FileOutputStream(file).use { it.write(pngbytes) }
//        return folder
//    }
    //

    fun Generate(content : String){
        val size = 512
        val bitmap = QRCodeWriter().encode(content,BarcodeFormat.QR_CODE,size,size)
        
    }
}