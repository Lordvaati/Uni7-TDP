function submeterFormulario() {
    let id = document.getElementById("id").value;
    let nome = document.getElementById("nome").value;
    let fabricante = document.getElementById("fabricante").value;
    let quantidade = document.getElementById("quantidade").value;
    let preco = document.getElementById("preco").value;

    let produto = {
        'id': id,
        'nome': nome,
        'fabricante': fabricante,
        'quantidade': quantidade,
        'preco': preco
    };

    function reqListener() {
        let cadastro = JSON.parse(this.responseText);
        adicionarProduto(produto);
    }

    let oReq = new XMLHttpRequest();
    oReq.onload = reqListener;
    oReq.open("POST", "cadastrarEstoque", true);
    oReq.setRequestHeader("Content-Type", "application/json");
    oReq.send(JSON.stringify(produto));

}

function adicionarProduto(produto) {
    let container = document.createElement("div");
    container.classList.add("container");

    let titulo = document.createElement("div");
    titulo.classList.add("row");
    titulo.innerHTML = "<h2>" + produto.id + "</h2>";

    let conteudo = document.createElement("div");
    conteudo.classList.add("row");
    let p = document.createElement("p");
    p.innerHTML = produto.nome;
    conteudo.appendChild(p);

    container.appendChild(id);
    container.appendChild(nome);
    document.getElementById("produtos").appendChild(container);
}

function exibirProduto() {
    let oReq = new XMLHttpRequest();
    oReq.onload = function() {
        let listaDeProduto = JSON.parse(this.responseText);
        for (let i = 0; i < listaDeProduto.length; i++) {
            adicionarProduto(listaDeProduto[i]);
        }
    };
    oReq.open("GET", "formEstoque", true);
    oReq.setRequestHeader("Content-Type", "application/json");
    oReq.send();
}

window.addEventListener("load", function () {
    exibirProduto();
});