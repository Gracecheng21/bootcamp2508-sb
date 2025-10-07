package com.bootcamp.demo.bc_mtr_station.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ScheduleDTO {
  private LocalDateTime systemTime;
  private LocalDateTime currentTime;
  private DataResponseDTO dataResponseDTO;
  private Integer status;
  private String message;
  private String isDelay;

  @Getter
  @Builder
  public static class DataResponseDTO {
    private Map<String, StationScheduleDTO> data;
    private LocalDateTime systemTime;
    private LocalDateTime currentTime;

    @Getter
    @Builder
    public static class StationScheduleDTO {
      private LocalDateTime currentTime;
      private LocalDateTime systemTime;
      private List<TrainInfoDTO> UP;
      private List<TrainInfoDTO> DOWN;

      @Getter
      @Builder
      public static class TrainInfoDTO {
        private Integer seq; // 列車次序
        private String dest; // 目的地，例如 "NOP"
        private String plat; // 月台號，例如 "1"
        private LocalDateTime time; // 到站時間，例如 "1728"
        private Integer ttnt; // 分鐘數（time to next train）
        private String valid;
        private String source;
      }
    }
  }


}
