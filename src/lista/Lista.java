public boolean remover(int id) {
    No<T> remove = inicio;
    No<T> auxRemove = null;
    Carro c;

    while (remove != null) {
        c = (Carro) remove.getItem();

        if (id == c.getId()) {
            break;
        }

        auxRemove = remove;
        remove = remove.getProx();
    }

    // verificacao de onde parou na lista
    if (remove == null) {
        return false;
    }

    // remove o unico elemento da lista
    if (remove == inicio && remove == fim) {
        inicio = null;
        fim = null;
        aux = null;
    }

    // remover o primeiro no
    else if (remove == inicio) {
        inicio = remove.getProx();
        remove.setProx(null);
    }

    // remove o ultimo no
    else if (remove == fim) {
        fim = auxRemove;
        aux = auxRemove;
        auxRemove.setProx(null);
    }

    // remove um no do meio
    else {
        auxRemove.setProx(remove.getProx());
        remove.setProx(null);
    }

    return true;
}