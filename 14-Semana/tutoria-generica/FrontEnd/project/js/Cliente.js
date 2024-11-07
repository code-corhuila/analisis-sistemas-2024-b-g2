$(document).ready(function () {
    loadData();
});

function loadData() {
    $.ajax({
        url: 'http://localhost:9000/api/cliente', 
        method: 'GET',
        success: function (data) {
            let tableContent = '';
            data.forEach((item) => {
                tableContent += `
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.documento}</td>
                        <td>${item.nombre}</td>
                        <td>${item.correo}</td>
                        <td>
                            <button class="btn btn-info btn-sm" onclick="editRecord(${item.id})">Editar</button>
                            <button class="btn btn-danger btn-sm" onclick="deleteRecord(${item.id})">Eliminar</button>
                        </td>
                    </tr>`;
            });
            $('#dataBody').html(tableContent);
        },
        error: function (error) {
            console.error('Error al cargar datos', error);
        }
    });
}

function createOrUpdate() {
    const id = $('#id').val();
    const data = {
        documento: $('#documento').val(),
        nombre: $('#nombre').val(),
        correo: $('#correo').val()
    };

    const url = id ? `http://localhost:9000/api/cliente/${id}` : 'http://localhost:9000/api/cliente'; // Cambia la URL según tu API
    const method = id ? 'PUT' : 'POST';

    $.ajax({
        url: url,
        method: method,
        contentType: 'application/json',
        data: JSON.stringify(data),
        success: function () {
            resetForm();
            loadData();
            alert('Registro guardado con éxito');
        },
        error: function (error) {
            console.error('Error al guardar datos', error);
        }
    });
}

function editRecord(id) {
    $.ajax({
        url: `http://localhost:9000/api/cliente/${id}`, // Cambia la URL a tu API
        method: 'GET',
        success: function (data) {
            $('#id').val(data.id);
            $('#documento').val(data.documento);
            $('#nombre').val(data.nombre);
            $('#correo').val(data.correo);
        },
        error: function (error) {
            console.error('Error al obtener registro', error);
        }
    });
}

function deleteRecord(id) {
    if (confirm('¿Estás seguro de eliminar este registro?')) {
        $.ajax({
            url: `http://localhost:9000/api/cliente/${id}`, // Cambia la URL a tu API
            method: 'DELETE',
            success: function () {
                loadData();
                alert('Registro eliminado con éxito');
            },
            error: function (error) {
                console.error('Error al eliminar registro', error);
            }
        });
    }
}

function resetForm() {
    $('#id').val('');
    $('#crudForm')[0].reset();
}
