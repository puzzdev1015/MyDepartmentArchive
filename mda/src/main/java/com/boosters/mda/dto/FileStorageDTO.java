package com.boosters.mda.dto;

import com.boosters.mda.entity.FileStorageEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FileStorageDTO {
	private String id; // 삭제 예정
	private String userId;
	private String fName;
	private String fUri;
	private String time;
	
	public FileStorageDTO(final FileStorageEntity entity) {
		this.id = entity.getId(); // 삭제 예정
		this.userId = entity.getUserId();
		this.fName = entity.getFOrgName();
		this.fUri = entity.getFUri();
		this.time = entity.getTime();
	}
	
	// 모델 -> 엔티티 변경 예정
	public static FileStorageEntity toEntity(final FileStorageDTO dto) {
		return FileStorageEntity.builder()
				.id(dto.getId())
				.userId(dto.getUserId())
				.fOrgName(dto.getFName())
				.fUUIDName("UUID"+dto.getFName())
				.fUri(dto.getFUri())
				.time(dto.getTime())
				.build();
	}
}
