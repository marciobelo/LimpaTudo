package limpatudo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class NotaVenda {
    
    private Long id;

    private LocalDateTime dataHoraVenda;

    private ItemVenda[] itens;

    public NotaVenda(Long id, LocalDateTime dataHoraVenda, ItemVenda[] itens) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for(ItemVenda item : itens) {
            BigDecimal subTotal = item.getPrecoNaDataDeVenda()
                .multiply( BigDecimal.valueOf( item.getQuantidade()));
            total = total.add( subTotal);
        }
        return total;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public ItemVenda[] getItens() {
        return itens;
    }

    public String gerarExtrato() {
        return ""; // a fazer
    }
}
