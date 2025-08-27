package com.example.demo.services;

import com.example.demo.dto.LikeRequestDTO;
import com.example.demo.dto.LikeResponseDTO;
import reactor.core.publisher.Mono;

public interface ILikeService {

    public Mono<LikeResponseDTO> createLike(LikeRequestDTO likeRequestDTO);

    public Mono<LikeResponseDTO> countLikesByTargetIdAndTargetType(String targetId, String targetType);

    public Mono<LikeResponseDTO> countDisLikesByTargetIdAndTargetType(String targetId, String targetType);

    public Mono<LikeResponseDTO> toggleLike(String targetId, String targetType, Boolean isLike);


}
