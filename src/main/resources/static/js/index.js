function actualizar(){
	var tipo=$("#tipo").val();
	var ciudad=$('#ciudad').val();
	var dias= $('#dias').val();
	location.href='/?ciudad='+ciudad+'&units='+tipo+'&dia='+dias;
}